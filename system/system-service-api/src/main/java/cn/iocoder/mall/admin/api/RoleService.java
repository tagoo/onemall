package cn.iocoder.mall.admin.api;

import cn.iocoder.common.framework.vo.PageResult;
import cn.iocoder.mall.admin.api.bo.role.RoleBO;
import cn.iocoder.mall.admin.api.dto.role.RoleAddDTO;
import cn.iocoder.mall.admin.api.dto.role.RoleAssignResourceDTO;
import cn.iocoder.mall.admin.api.dto.role.RolePageDTO;
import cn.iocoder.mall.admin.api.dto.role.RoleUpdateDTO;

import java.util.Collection;
import java.util.List;

public interface RoleService {

    PageResult<RoleBO> getRolePage(RolePageDTO rolePageDTO);

    /**
     * @return 返回角色列表
     */
    List<RoleBO> getRoleList();

    List<RoleBO> getRoleList(Collection<Integer> ids);

    RoleBO addRole(Integer adminId, RoleAddDTO roleAddDTO);

    Boolean updateRole(Integer adminId, RoleUpdateDTO roleUpdateDTO);

    Boolean deleteRole(Integer adminId, Integer roleId);

    Boolean assignRoleResource(Integer adminId, RoleAssignResourceDTO roleAssignResourceDTO);

}
