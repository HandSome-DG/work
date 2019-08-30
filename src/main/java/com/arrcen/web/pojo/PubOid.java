package com.arrcen.web.pojo;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/8/1 9:06
 * @since 1.0.0
 */
@Entity
@Table(name = "PUB_OID分配表", schema = "AMBASE_HDR", catalog = "")
public class PubOid {

    private long 系统序号;
    private String oid;
    private String oid名称;
    private String 映射代码表;
    private String 描述;
    private String 分配表;
    private String 备注;
    private String 版本;

    @Id
    @Column(name = "系统序号")
    public long get系统序号() {
        return 系统序号;
    }

    public void set系统序号(long 系统序号) {
        this.系统序号 = 系统序号;
    }

    @Basic
    @Column(name = "OID")
    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    @Basic
    @Column(name = "OID名称")
    public String getOid名称() {
        return oid名称;
    }

    public void setOid名称(String oid名称) {
        this.oid名称 = oid名称;
    }

    @Basic
    @Column(name = "映射代码表")
    public String get映射代码表() {
        return 映射代码表;
    }

    public void set映射代码表(String 映射代码表) {
        this.映射代码表 = 映射代码表;
    }

    @Basic
    @Column(name = "描述")
    public String get描述() {
        return 描述;
    }

    public void set描述(String 描述) {
        this.描述 = 描述;
    }

    @Basic
    @Column(name = "分配表")
    public String get分配表() {
        return 分配表;
    }

    public void set分配表(String 分配表) {
        this.分配表 = 分配表;
    }

    @Basic
    @Column(name = "备注")
    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注;
    }

    @Basic
    @Column(name = "版本")
    public String get版本() {
        return 版本;
    }

    public void set版本(String 版本) {
        this.版本 = 版本;
    }

}
