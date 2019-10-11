package spring.biz.route.service;

import java.util.List;

import spring.biz.driver.vo.DriverVO;
import spring.biz.route.vo.RouteVO;

public interface RouteService {
	
	int addRoute(RouteVO route);
	
	RouteVO getRoute(String station);

	List<RouteVO> getRouteList();

}
