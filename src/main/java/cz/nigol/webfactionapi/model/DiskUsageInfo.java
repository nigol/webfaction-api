package cz.nigol.webfactionapi.model;

import java.util.List;

/**
 * Overall disk usage info.
 */
public class DiskUsageInfo {
    private List<DiskUsage> homeDirectories;
    private List<DiskUsage> mailboxes;
    private List<DiskUsage> mySqlDatabases;
    private List<DiskUsage> postgreSqlDatabases;
    private double total;
    private double quota;
    private double percentage;

    /**
     * @return the homeDirectories
     */
    public List<DiskUsage> getHomeDirectories() {
        return homeDirectories;
    }

    /**
     * @param homeDirectories the homeDirectories to set
     */
    public void setHomeDirectories(List<DiskUsage> homeDirectories) {
        this.homeDirectories = homeDirectories;
    }

    /**
     * @return the mailboxes
     */
    public List<DiskUsage> getMailboxes() {
        return mailboxes;
    }

    /**
     * @param mailboxes the mailboxes to set
     */
    public void setMailboxes(List<DiskUsage> mailboxes) {
        this.mailboxes = mailboxes;
    }

    /**
     * @return the mySqlDatabases
     */
    public List<DiskUsage> getMySqlDatabases() {
        return mySqlDatabases;
    }

    /**
     * @param mySqlDatabases the mySqlDatabases to set
     */
    public void setMySqlDatabases(List<DiskUsage> mySqlDatabases) {
        this.mySqlDatabases = mySqlDatabases;
    }

    /**
     * @return the postgreSqlDatabases
     */
    public List<DiskUsage> getPostgreSqlDatabases() {
        return postgreSqlDatabases;
    }

    /**
     * @param postgreSqlDatabases the postgreSqlDatabases to set
     */
    public void setPostgreSqlDatabases(List<DiskUsage> postgreSqlDatabases) {
        this.postgreSqlDatabases = postgreSqlDatabases;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the quota
     */
    public double getQuota() {
        return quota;
    }

    /**
     * @param quota the quota to set
     */
    public void setQuota(double quota) {
        this.quota = quota;
    }

    /**
     * @return the percentage
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
