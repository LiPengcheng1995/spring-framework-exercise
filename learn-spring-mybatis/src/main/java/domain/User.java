package domain;

import java.util.Date;

/**
 * Package: PACKAGE_NAME
 * domain.User: 李鹏程
 * Date: 2019-07-31
 * Time: 20:45
 * Description:
 */
public class User {

    private Long formId;
    private Date createTime;
    private Date updateTime;
    private String creator;
    private String modifier;
    private Long businessId;
    private String formName;
    private Long templateId;
    private String creationCode;
    private boolean isDeleted;

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getCreationCode() {
        return creationCode;
    }

    public void setCreationCode(String creationCode) {
        this.creationCode = creationCode;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
