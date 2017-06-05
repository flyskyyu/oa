package com.app.officeautomationapp.common;

/**
 * Created by CS-711701-00027 on 2017/4/28.
 */

public class Constants {
    public static final String ip="http://218.90.143.118";
    public static final String port="89";

    public final static String address=ip+":"+port;

    public final static String login=address+"/api/V1/Login/Login";//登录

    public final static String getMessage=address+"/api/V1/Sys/GetPageList";//获取消息接口//?pageIndex={pageIndex}&pageSize={pageSize}

    public final static String getReadRecords=address+"/api/V1/Sys/GetReadRecords";//获取消息已读人员列表?noticeId=115

    public final static String getGetMessageDetail="/api/V1/Sys/GetNoticeDetails";//获取消息详情，目前只需调用一下?noticeId={noticeId}

    public final static String getMyProject=address+"/api/V1/Project/GetMyProjectList";//获取我参与的工程

    public final static String getSaveHiddenProject=address+"/api/V1/HideProject/SaveHideProject";//保存隐藏工程

    public final static String getHiddenProject=address+"/api/V1/HideProject/GetHideProjectPageList";//?projectName= &pageIndex=1&pageSize=20

    public final static String deleteHiddenProject=address+"/api/V1/HideProject/DeleteHideProject";//删除我的隐藏工程{id}

    public final static String addArchMachine=address+"/api/V1/Flow/AddArchMachine";//台班申请



    public final static String addArchJob=address+"/api/V1/Flow/AddArchJob";//点工申请

    public final static String addArchSign=address+"/api/V1/Flow/AddArchSign";//用章申请

    public final static String addArchLeave=address+"/api/V1/Flow/AddArchLeave";//请假申请

    public final static String getToUser=address+"/api/V1/WorkFlow/SelectUsersByRealName";//获取获取审批人?realName=

    public final static String IMG_PATH=address+"/AppFileServer/";//图片地址

    public final static String getThings=address+"/api/V1/Res/GetList";//根据商品名称或规格获取物品列表?resNameOrSpecial={resNameOrSpecial}

    public final static String addReceiveThing=address+"/api/V1/Res/ApplyResTransaction";//物品领用申请提交?resId={resId}&num={num}&projectId={projectId}&toUser={toUser}&remark={remark}


    public final static String FlowGuidArchMachine="d1693633-e78a-4f7d-97fc-a3742639eaa9"; //机械台班结算单审批 api/V1/WorkFlow/GetFlowList

    public final static String FlowGuidaddArchJob="9fac41f7-fd37-4959-8bc0-7c35922fd204";//现场用工签工单审批

    public final static String FlowGuidaddArchSign="f58f8da6-a7f2-45d9-8fb1-70ec0bdc83f2";//用章管理流程
}
