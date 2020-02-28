package modify.shiro.demo.common.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import modify.shiro.demo.common.model.UUserRole;

@Mapper
public interface UUserRoleMapper {
	int insert(UUserRole record);

	int insertSelective(UUserRole record);

	int deleteByUserId(Long id);

	int deleteRoleByUserIds(Map<String, Object> resultMap);

	List<Long> findUserIdByRoleId(Long id);
}