package com.tiger.mediaquality.com.tiger.mediaquality.qc;

import java.util.UUID;

public class qcaction {
    // 质检模块序号
    private UUID mActionId;
    // 质检模块标题
    private String mTitle;
    // 质检模块状态，没有动作，正在质检中，已经完毕
    private Boolean mState;
    // 质检模块类型 视频/音频
    private Integer mType;
    // 质检模块的结果
    private Boolean mResultIsSuccess;


}
