package com.example.glovis.adapter.persistence.user;

import com.example.glovis.application.domain.user.User;
import org.mapstruct.*;

import java.util.List;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
//@MapperConfig(unmappedTargetPolicy = ReportingPolicy.IGNORE)
//public interface UserMapper extends GenericMapper<UserResponse, UserEntity> {
//}
public interface UserMapper  {

//    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    @Mapping(target = "password", ignore = true)
    User toDomain(UserEntity userEntity);

    List<User> toDomainList(List<UserEntity> list);

    UserEntity toEntity(User user);





}
