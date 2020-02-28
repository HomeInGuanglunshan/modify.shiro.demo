package modify.shiro.demo.common.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import modify.shiro.demo.common.model.UUser;
import modify.shiro.demo.permission.bo.URoleBo;

@Mapper
public interface UUserMapper {

	int deleteByPrimaryKey(Long id);

	int insert(UUser record);

	int insertSelective(UUser record);

	UUser selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(UUser record);

	int updateByPrimaryKey(UUser record);

	UUser login(Map<String, Object> map);

	UUser findUserByEmail(String email);

	List<URoleBo> selectRoleByUserId(Long id);

}