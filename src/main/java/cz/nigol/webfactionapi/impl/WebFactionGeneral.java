package cz.nigol.webfactionapi.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Date;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;

import cz.nigol.webfactionapi.model.DiskUsage;
import cz.nigol.webfactionapi.model.DiskUsageInfo;
import cz.nigol.webfactionapi.model.WebFactionSession;

/**
 * General functions, see https://docs.webfaction.com/xmlrpc-api/apiref.html#general
 */
public class WebFactionGeneral {

    /**
     * List disk space usage statistics about your account.
     * @param session   instance of WebFactionSession
     * @return
     * @throws XmlRpcException
     */
    public DiskUsageInfo listDiskUsage(WebFactionSession session) throws XmlRpcException {
        XmlRpcClient client = session.getXmlRpcClientFactory().getXmlRpcClient();
        List<String> params = Arrays.asList(session.getSessionId());
        @SuppressWarnings("unchecked")
        Map<String, Object> result = (Map<String, Object>) client.execute("list_disk_usage", params);
        return prepareDiskUsageInfoInstance(result);
    }

    private DiskUsageInfo prepareDiskUsageInfoInstance(Map<String, Object> response) {
        DiskUsageInfo result = new DiskUsageInfo();
        Object[] homeDirs = (Object[]) response.get("home_directories");
        result.setHomeDirectories(prepareHomeDirectories(Arrays.asList(homeDirs)));
        Object[] mailboxes = (Object[]) response.get("mailboxes");
        result.setMailboxes(prepareOtherUsage(Arrays.asList(mailboxes)));
        Object[] mysqlDatabases = (Object[]) response.get("mysql_databases");
        result.setMySqlDatabases(prepareOtherUsage(Arrays.asList(mysqlDatabases)));
        Object[] postgresqlDatabases = (Object[]) response.get("postgresql_databases");
        result.setPostgreSqlDatabases(prepareOtherUsage(Arrays.asList(postgresqlDatabases)));
        result.setTotal((Double) response.get("total"));
        result.setQuota((Double) response.get("quota"));
        result.setPercentage((Double) response.get("percentage"));
        return result;
    }

    private Date prepareDate(String dateString) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date;
        try {
            date = format.parse(dateString);
        } catch (ParseException e) {
            date = new Date();
        }
        return date;
    }

    private List<DiskUsage> prepareHomeDirectories(List<Object> homeDirs) {
        return homeDirs.stream()
            .map(o -> {
                @SuppressWarnings("unchecked")
                Map<String, Object> m = (Map<String, Object>) o;
                DiskUsage usage = new DiskUsage();
                usage.setLastReading(prepareDate((String) m.get("last_reading")));
                usage.setMachine((String) m.get("machine"));
                usage.setName((String) m.get("name"));
                usage.setSize((Integer) m.get("size"));
                return usage;
            })
        .collect(Collectors.toList());
    }

    private List<DiskUsage> prepareOtherUsage(List<Object> others) {
        return others.stream()
            .map(o -> {
                @SuppressWarnings("unchecked")
                Map<String, Object> m = (Map<String, Object>) o;
                DiskUsage usage = new DiskUsage();
                usage.setLastReading(prepareDate((String) m.get("last_reading")));
                usage.setName((String) m.get("name"));
                usage.setSize((Integer) m.get("size"));
                return usage;
            })
        .collect(Collectors.toList());
    }
}
