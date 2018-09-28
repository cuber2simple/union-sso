package org.cuber.sso.mapper;

import com.github.pagehelper.Page;
import org.cuber.anno.SplitStrategy;
import org.cuber.anno.TableSplitStrategy;
import org.cuber.sso.dto.LoginLog;
import org.cuber.stub.repo.Mapper;

import java.util.Map;

@TableSplitStrategy(strategy = SplitStrategy.equals, expl = "#findIdTime('T_LOGIN_LOG',id)", splitTables = "T_LOGIN_LOG")
public interface LoginLogMapper extends Mapper<LoginLog, String> {

    @Override
    @TableSplitStrategy(strategy = SplitStrategy.equals, expl = "#findIdTime('T_LOGIN_LOG',#root)", splitTables = "T_LOGIN_LOG")
    LoginLog retrieveById(String id);

    @TableSplitStrategy(strategy = SplitStrategy.between, bottomExpl = "#ldt_parse([startDate], 'yyyy-MM')", topExpl = "#ldt_parse([endDate], 'yyyy-MM')", splitTables = "T_LOGIN_LOG")
    Page<LoginLog> retrievePage(Map search);

    int logout(LoginLog loginLog);
}