package com.eumji.zblog.vo;

import org.apache.ibatis.type.Alias;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * FILE: com.eumji.zblog.vo.User.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/4/9
 * TIME: 10:13
 */
@Alias("user")
public class User implements Serializable {
    private long id;
    private String username;
    private String password;
    private boolean expired; //过期
    private boolean locked; //被锁
    private boolean credential;  //凭证
    private boolean enabled;  //禁用
    private Date createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isCredential() {
        return credential;
    }

    public void setCredential(boolean credential) {
        this.credential = credential;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAccountNonExpired() {
        return expired;
    }

    public boolean isAccountNonLocked() {
        return locked;
    }

    public boolean isCredentialsNonExpired() {
        return credential;
    }

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", expired=" + expired +
                ", locked=" + locked +
                ", credential=" + credential +
                ", enabled=" + enabled +
                ", createTime=" + createTime +
                '}';
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
}
