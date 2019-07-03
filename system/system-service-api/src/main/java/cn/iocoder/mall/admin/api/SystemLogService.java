package cn.iocoder.mall.admin.api;

import cn.iocoder.common.framework.vo.PageResult;
import cn.iocoder.mall.admin.api.bo.systemlog.AccessLogPageBO;
import cn.iocoder.mall.admin.api.dto.systemlog.AccessLogAddDTO;
import cn.iocoder.mall.admin.api.dto.systemlog.AccessLogPageDTO;
import cn.iocoder.mall.admin.api.dto.systemlog.ExceptionLogAddDTO;

/**
 * 系统日志 Service 接口
 *
 * 例如说，访问日志、错误日志、操作日志等等
 */
public interface SystemLogService {

    void addAccessLog(AccessLogAddDTO accessLogAddDTO);

    void addExceptionLog(ExceptionLogAddDTO exceptionLogAddDTO);

    AccessLogPageBO getAccessLogPage(AccessLogPageDTO accessLogPageDTO);
}
