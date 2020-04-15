package com.tiger.mediaquality.com.tiger.mediaquality.qc;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class QCActionLab {
    private UUID mQCActionLabId;
    private String mIsureCode;
    private List<QCAction> mQCActions;

    private static QCActionLab sQCActionLab;

    public static QCActionLab get(Context context) {
        if (sQCActionLab == null) {
            sQCActionLab = new QCActionLab(context);
        }
        return sQCActionLab;
    }

    private QCActionLab(Context context) {
        mQCActions = new ArrayList<>();

        QCAction act1 = new QCAction();
        act1.setTitle("投保人身份认证");
        act1.setContent("请投保人将身份证停留镜头前3秒");
        act1.setType(1);
        mQCActions.add(act1);

        QCAction act2 = new QCAction();
        act2.setTitle("代理人身份认证");
        act2.setContent("请代理人将展业证停留镜头前3秒");
        act2.setType(1);
        mQCActions.add(act2);

        QCAction act3 = new QCAction();
        act3.setTitle("保险免责条例确认");
        act3.setContent("请代理人将保险免责条例文本停留镜头前3秒");
        act3.setType(1);
        mQCActions.add(act3);

        QCAction act4 = new QCAction();
        act4.setTitle("保险合同确认");
        act4.setContent("请代理人将保险合同文本停留镜头前3秒");
        act4.setType(1);
        mQCActions.add(act4);

        QCAction act5 = new QCAction();
        act5.setTitle("保险合同签字确认");
        act5.setContent("请代理人将保险合同签字页停留镜头前3秒");
        act5.setType(1);
        mQCActions.add(act5);

    }

    public List<QCAction> getQCActions() {
        return mQCActions;
    }

    public QCAction getQcAction(UUID id) {
        for (QCAction qcAction : mQCActions) {
            if (qcAction.getActionId().equals(id)) {
                return qcAction;
            }
        }
        return null;
    }
}
