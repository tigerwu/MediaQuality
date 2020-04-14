package com.tiger.mediaquality.com.tiger.mediaquality.qc;

import java.util.UUID;

public class QCAction {
    // 质检模块序号
    private UUID mActionId;
    // 质检模块标题
    private String mTitle;
    // 质检模块内容
    private String mContent;
    // 质检模块状态，等待质检，正在质检中，已经完毕 1/2/3
    private Integer mState;
    // 质检模块类型 视频/音频 1/2
    private Integer mType;
    // 质检模块的结果
    private Boolean mIsSuccess;

    public QCAction() {
        mActionId = UUID.randomUUID();
        mIsSuccess = false;
        mState = 1;
    }

    public UUID getActionId() {
        return mActionId;
    }

    public void setActionId(UUID actionId) {
        mActionId = actionId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public Integer getState() {
        return mState;
    }

    public void setState(Integer state) {
        mState = state;
    }

    public Integer getType() {
        return mType;
    }

    public void setType(Integer type) {
        mType = type;
    }

    public Boolean getSuccess() {
        return mIsSuccess;
    }

    public void setSuccess(Boolean success) {
        mIsSuccess = success;
    }
}
