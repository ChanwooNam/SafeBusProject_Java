package spring.biz.route.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import spring.biz.driver.vo.DriverVO;
import spring.biz.route.dao.RouteDAO;
import spring.biz.route.vo.RouteVO;

@Service("routeservice")
public class RouteServiceImpl implements RouteService{
	
	@Resource(name = "routemybatis")
	RouteDAO dao;
	
	@Autowired
	ApplicationContext context;
	
	public RouteServiceImpl() {
		super();
	}
	
	public RouteDAO getDao() {
		return dao;
	}
	
	public void setDao(RouteDAO dao) {
		this.dao = dao;
	}
	
	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	@Override
	public int addRoute(RouteVO Route) {
		return dao.addRoute(Route);
	}

	@Override
	public RouteVO getRoute(String station) {
		return dao.getRoute(station);
	}

	@Override
	public List<RouteVO> getRouteList() {
		return dao.getRouteList();
	}
	
	@Override
	public String getRouteInfo_gokinder(String state, String station1, String station2) {
		
		return null;
	}
	
	

}
