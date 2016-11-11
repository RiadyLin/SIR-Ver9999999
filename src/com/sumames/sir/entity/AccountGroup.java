/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "account_group", catalog = "sir", schema = "")
@NamedQueries({
    @NamedQuery(name = "AccountGroup.findAll", query = "SELECT a FROM AccountGroup a")})
public class AccountGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "record_id")
    private Integer recordId;
    @Column(name = "account_group_name")
    private Integer accountGroupName;
    @Column(name = "account_group_sub_name")
    private String accountGroupSubName;
    @Column(name = "note")
    private String note;
    @Column(name = "void_status")
    private Boolean voidStatus;
    @Column(name = "void_note")
    private String voidNote;
    @Column(name = "create_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDatetime;
    @Column(name = "create_by_record_id")
    private Integer createByRecordId;
    @Column(name = "authorize_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authorizeDatetime;
    @Column(name = "authorize_by_record_id")
    private Integer authorizeByRecordId;
    @Column(name = "edit_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editDatetime;
    @Column(name = "edit_by_record_id")
    private Integer editByRecordId;
    @Column(name = "delete_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDatetime;
    @Column(name = "delete_by_record_id")
    private Integer deleteByRecordId;

    public AccountGroup() {
    }

    public AccountGroup(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getAccountGroupName() {
        return accountGroupName;
    }

    public void setAccountGroupName(Integer accountGroupName) {
        this.accountGroupName = accountGroupName;
    }

    public String getAccountGroupSubName() {
        return accountGroupSubName;
    }

    public void setAccountGroupSubName(String accountGroupSubName) {
        this.accountGroupSubName = accountGroupSubName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getVoidStatus() {
        return voidStatus;
    }

    public void setVoidStatus(Boolean voidStatus) {
        this.voidStatus = voidStatus;
    }

    public String getVoidNote() {
        return voidNote;
    }

    public void setVoidNote(String voidNote) {
        this.voidNote = voidNote;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Integer getCreateByRecordId() {
        return createByRecordId;
    }

    public void setCreateByRecordId(Integer createByRecordId) {
        this.createByRecordId = createByRecordId;
    }

    public Date getAuthorizeDatetime() {
        return authorizeDatetime;
    }

    public void setAuthorizeDatetime(Date authorizeDatetime) {
        this.authorizeDatetime = authorizeDatetime;
    }

    public Integer getAuthorizeByRecordId() {
        return authorizeByRecordId;
    }

    public void setAuthorizeByRecordId(Integer authorizeByRecordId) {
        this.authorizeByRecordId = authorizeByRecordId;
    }

    public Date getEditDatetime() {
        return editDatetime;
    }

    public void setEditDatetime(Date editDatetime) {
        this.editDatetime = editDatetime;
    }

    public Integer getEditByRecordId() {
        return editByRecordId;
    }

    public void setEditByRecordId(Integer editByRecordId) {
        this.editByRecordId = editByRecordId;
    }

    public Date getDeleteDatetime() {
        return deleteDatetime;
    }

    public void setDeleteDatetime(Date deleteDatetime) {
        this.deleteDatetime = deleteDatetime;
    }

    public Integer getDeleteByRecordId() {
        return deleteByRecordId;
    }

    public void setDeleteByRecordId(Integer deleteByRecordId) {
        this.deleteByRecordId = deleteByRecordId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recordId != null ? recordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountGroup)) {
            return false;
        }
        AccountGroup other = (AccountGroup) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumames.sir.entity.AccountGroup[ recordId=" + recordId + " ]";
    }
    
}
