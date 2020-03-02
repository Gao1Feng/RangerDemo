package com.musk.service;

import com.musk.pojo.CreatePoliceReq;
import com.musk.pojo.UpdatePoliceReq;

public interface Ranger {
    /**
     * 获取所有有效的策略
     * @return
     */
    public String getAllValidPolice();

    /**
     * 创建策略
     * @param createRequest
     * @return
     */
    public boolean createPolice(CreatePoliceReq createRequest);

    /**
     * 通过策略名称获取策略
     * @param policyName
     * @param policyType 策略类型：hive或hdfs/hbase
     * @return
     */
    public String getPolicyByName(String policyName, String policyType);

    /**
     * 通过policeName 删除策略
     * @param policeName
     * @return
     */
    public boolean deletePoliceByPoliceName(String policeName);

    /**
     * 通过policeId 删除策略
     * @param policeId
     * @return
     */
    public boolean deletePoliceByPoliceId(String policeId);

    /**
     * 修改策略
     * @param updatePoliceReq
     * @return
     */
    public boolean updatePolicyById(UpdatePoliceReq updatePoliceReq);

    /**
     * 根据用户名，获取该用户对数据库的访问记录
     * @param userName
     * @param startDate
     * @return
     */
    public String getUserVisitInfo(String userName, String startDate);
}
