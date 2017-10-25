package com.mcom;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MusicItemMapper {
	
	@Select("SELECT * from musicitem where MUSICCATEGORY = #{cat}")
	List<MusicItem> findByCat(@Param("cat") String cat);

}
