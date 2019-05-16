package overun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import overun.mapper.MenuMapper;
import overun.model.Menu;
import overun.model.MenuExample;
import overun.service.MenuService;

import java.util.List;

/**
 * @ClassName: MenuServiceImpl
 * @Description:
 * @author: ZhangPY
 * @version: V1.0
 * @date: 2019/5/15 15:22
 * @Copyright:
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenusByUserId(Long id) {



        return null;
    }
}
