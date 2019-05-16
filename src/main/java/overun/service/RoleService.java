package overun.service;

import overun.model.Menu;
import overun.model.Role;

import java.util.List;

/**
 * @ClassName: RoleService
 * @Description:
 * @author: ZhangPY
 * @version: V1.0
 * @date: 2019/5/15 15:59
 * @Copyright:
 */
public interface RoleService {

    List<Menu> findMenusByUserId(Long id);
}
