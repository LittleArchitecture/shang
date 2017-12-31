package com.shang.sys.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonProperty;
/**
 * @author NICK
 * @since 2016年3月8日
 */
public class SysUser implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	@JsonProperty("USER_ID")
	private String userId;
	@NotNull
	@JsonProperty("PASSWORD")
	private String password;
	@NotNull
	@JsonProperty("USER_NAME")
	private String userName;
	@JsonProperty("ROLE_CODE")
	private String roleCode;
	@JsonProperty("ORG_ID")
	private String orgId;
	@JsonProperty("EMAIL")
	private String email;
	@JsonProperty("LOGIN_COUNT")
	private int loginCount;
	@JsonProperty("LAST_LOGIN_TIME")
	private Date lastLoginTime;
	@JsonProperty("LAST_LOGIN_IP")
	private String lastLoginIp;
	@JsonProperty("DISABLE_FLAG")
	private String disableFlag;
	@JsonProperty("DESC_INFO")
	private String descInfo;
	@JsonProperty("CREATE_BY")
	private String createBy;
	@JsonProperty("CREATE_TIME")
	private Date createTime;
	@JsonProperty("UPDATE_BY")
	private String updateBy;
	@JsonProperty("UPDATE_TIME")
	private Date updateTime;
	
	public SysUser() {
	}
	
	public SysUser(String userId, String password, String userName,
			String roleCode, String orgId, String email, int loginCount,
			Date lastLoginTime, String lastLoginIp, String disableFlag,
			String descInfo, String createBy, Date createTime, String updateBy,
			Date updateTime) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.roleCode = roleCode;
		this.orgId = orgId;
		this.email = email;
		this.loginCount = loginCount;
		this.lastLoginTime = lastLoginTime;
		this.lastLoginIp = lastLoginIp;
		this.disableFlag = disableFlag;
		this.descInfo = descInfo;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getLastLoginIp() {
		return lastLoginIp;
	}
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	public String getDisableFlag() {
		return disableFlag;
	}
	public void setDisableFlag(String disableFlag) {
		this.disableFlag = disableFlag;
	}
	public String getDescInfo() {
		return descInfo;
	}
	public void setDescInfo(String descInfo) {
		this.descInfo = descInfo;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
	
}
