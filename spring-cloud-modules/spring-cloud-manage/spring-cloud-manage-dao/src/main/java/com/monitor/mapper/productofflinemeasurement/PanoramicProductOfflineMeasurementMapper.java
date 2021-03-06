package com.monitor.mapper.productofflinemeasurement;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.cloud.core.IMapper;
import com.monitor.model.productofflinemeasurement.PanoramicProductOfflineMeasurement;

/**
 * 
 * @author gang
 *
 */
@Repository("productOfflineMeasurementMapper")
public interface PanoramicProductOfflineMeasurementMapper extends IMapper<PanoramicProductOfflineMeasurement> {
	

    /**
     * 查询当前产品下线
     * @return
     */
    @Select("SELECT\n" + 
    		"	distinct code,name\n" + 
    		"FROM\n" + 
    		"	panoramic_product_offline_measurement\n" + 
    		"WHERE\n" + 
    		"	in_or_out = 0\n" + 
    		"AND delete_flag = 1\n" + 
    		"AND f_id = 2\n" + 
    		"")
    List<PanoramicProductOfflineMeasurement> listProductOfflineCategory();
}