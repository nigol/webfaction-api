package cz.nigol.webfactionapi.model;

import java.util.Date;

/**
 * Info for every particular disk usage.
 */
public class DiskUsage {
    private Date lastReading;
    private String machine;
    private String name;
    private int size;

    /**
     * @return the lastReading
     */
    public Date getLastReading() {
        return lastReading;
    }

    /**
     * @param lastReading the lastReading to set
     */
    public void setLastReading(Date lastReading) {
        this.lastReading = lastReading;
    }

    /**
     * Used only for home directories.
     * @return the machine
     */
    public String getMachine() {
        return machine;
    }

    /**
     * @param machine the machine to set
     */
    public void setMachine(String machine) {
        this.machine = machine;
    }

    /**
     * For home directories username, for mailboxes mailboxname, for MySQL databases database name, for PostgreSQL databases database name.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

}
