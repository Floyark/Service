package service;

import com.alibaba.fastjson.JSONObject;

import pojo.Themes;

import java.util.List;
import java.util.Map;

public interface ThemeService {
    @Deprecated
    public JSONObject getAllTheme(int pageNum, int pageSize);
    public int insertThemes(Map map);

    public int deleteThemes();

    int getTotals();


}
