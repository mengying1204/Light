package com.gmy.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mengying on 2017/8/18.
 */
@Entity
@Table(name = "light")
public class Light {
    private String id;
    private String name;
    private String location;
    private String manager;
    private String state;// 1：开；2：关；3：坏掉了
    private Date createTime;
    private Date lastUpdate;

    @Id
    @Column(name = "ID", updatable = false)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    @Column(name = "NAME")
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Column(name = "LOCATION")
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    @Column(name = "MANAGER")
    public String getManager() { return manager; }
    public void setManager(String manager) { this.manager = manager; }

    @Column(name = "STATE")
    public String getState() { return state;}
    public void setState(String state) { this.state = state;}

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name= "CREATE_TIME", updatable = false)
    public Date getCreateTime(){
        return createTime;
    }
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name= "LAST_UPDATE")
    public Date getLastUpdate(){
        return lastUpdate;
    }
    public void setLastUpdate(Date lastUpdate){
        this.lastUpdate = lastUpdate;
    }
}
