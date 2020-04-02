package com.tiger.mediaquality.com.tiger.mediaquality.qc;

import java.util.Date;
import java.util.UUID;

public class InsureQC {
    //保单质检序号
    private UUID mInsureQCId;

    //保险序号
    private Insure mInsure;

    //时间
    private Date mSignDate;

    //地点
    private String mSignLocation;

    //保单质检录像文件路径
    private String mRecordPath;

    //是否上传了
    private Boolean mIsUploaded;

    //质检点是否全部通过
    private Boolean mQCIsOk;

    //质检模块列表
    private QCActionLab mQcActionLab;
}
