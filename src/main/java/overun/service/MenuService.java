package overun.service;

import overun.model.Menu;

import java.util.List;

/**
 * @ClassName: MenuService
 * @Description:
 * @author: ZhangPY
 * @version: V1.0
 * @date: 2019/5/15 15:21
 * @Copyright:
 */
public interface MenuService {


    List<Menu> getMenusByUserId(Long id);
}
