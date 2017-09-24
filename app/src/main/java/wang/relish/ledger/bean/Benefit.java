package wang.relish.ledger.bean;

/**
 * @author Relish Wang
 * @since 2017/09/24
 */
public class Benefit {
    private long id;
    private long pid;
    private long date;
    private long benefit;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getBenefit() {
        return benefit;
    }

    public void setBenefit(long benefit) {
        this.benefit = benefit;
    }
}
