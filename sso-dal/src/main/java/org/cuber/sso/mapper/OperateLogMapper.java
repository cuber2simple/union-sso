package org.cuber.sso.mapper;

import com.github.pagehelper.Page;
import org.cuber.anno.SplitStrategy;
import org.cuber.anno.TableSplitStrategy;
import org.cuber.sso.dto.OperatorLog;
import org.cuber.stub.repo.Mapper;

import java.util.Map;

@TableSplitStrategy(strategy = SplitStrategy.equals, expl = "#findIdTime('T_OPERATE_LOG',${id})", splitTables = "T_OPERATE_LOG")
public interface OperateLogMapper extends Mapper<OperatorLog, String> {

    @TableSplitStrategy(strategy = SplitStrategy.equals, expl = "#findIdTime('T_OPERATE_LOG',#root)", splitTables = "T_OPERATE_LOG")
    OperatorLog retrieveById(String id);

    @TableSplitStrategy(strategy = SplitStrategy.between, bottomExpl = "#ldt_parse(${startDate}, #yyyy_MM)", topExpl = "#ldt_parse(${endDate}, #yyyy_MM)", splitTables = "T_OPERATE_LOG")
    Page<OperatorLog> retrievePage(Map search);
}