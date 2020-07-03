package ${package.ServiceImpl};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};
/**
 * <p>
 * ${table.comment!} 服务实现类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@Service
public class ${table.serviceImplName}  implements ${table.serviceName} {


     @Autowired
     private ${table.mapperName} ${table.mapperName?uncap_first};



}


