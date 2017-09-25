package wang.relish.ledger.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * @author Relish Wang
 * @since 2017/09/24
 */
@Entity
public class Benefit {
    @Id(autoincrement = true)
    private long id;
    @NotNull
    private long pid;
    @NotNull
    private long date;
    @NotNull
    private long benefit;

    @Generated(hash = 1005616138)
    public Benefit(long id, long pid, long date, long benefit) {
        this.id = id;
        this.pid = pid;
        this.date = date;
        this.benefit = benefit;
    }

    @Generated(hash = 1972077364)
    public Benefit() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getPid() {
        return this.pid;
    }
    public void setPid(long pid) {
        this.pid = pid;
    }
    public long getDate() {
        return this.date;
    }
    public void setDate(long date) {
        this.date = date;
    }
    public long getBenefit() {
        return this.benefit;
    }
    public void setBenefit(long benefit) {
        this.benefit = benefit;
    }
}
