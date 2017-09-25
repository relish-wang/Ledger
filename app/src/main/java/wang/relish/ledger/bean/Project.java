package wang.relish.ledger.bean;

import android.support.annotation.NonNull;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * @author Relish Wang
 * @since 2017/09/24
 */
@Entity
public class Project {
    @Id(autoincrement = true)
    private long id;
    @NonNull
    private String name;
    @NonNull
    private long startTime;
    @NonNull
    private long pid;
    @NonNull
    private double principal;
    @NonNull
    private double benefit;

    @Generated(hash = 149837081)
    public Project(long id, @NonNull String name, long startTime, long pid,
                   double principal, double benefit) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.pid = pid;
        this.principal = principal;
        this.benefit = benefit;
    }

    @Generated(hash = 1767516619)
    public Project() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getStartTime() {
        return this.startTime;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public long getPid() {
        return this.pid;
    }
    public void setPid(long pid) {
        this.pid = pid;
    }
    public double getPrincipal() {
        return this.principal;
    }
    public void setPrincipal(double principal) {
        this.principal = principal;
    }
    public double getBenefit() {
        return this.benefit;
    }
    public void setBenefit(double benefit) {
        this.benefit = benefit;
    }
}
