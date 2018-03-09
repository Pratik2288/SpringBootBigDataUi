package com.hbd.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hbd.pojo.NavPojo;

@Transactional
@Repository
public class NavDao implements INavDao {

	@PersistenceContext
	EntityManager eManager;

	@Override
	public List<NavPojo> getAllNAvValue() {

		String hql = "FROM com.hbd.pojo.NavPojo as nav ORDER BY nav.id";
		return (List<NavPojo>) eManager.createQuery(hql).getResultList();

	}

	@Override
	public NavPojo getNavById(int id) {
		return eManager.find(NavPojo.class, id);
	}

	@Override
	public void addNav(NavPojo nav) {
		eManager.persist(nav);

	}

	@Override
	public void updateNav(NavPojo nav) {
		NavPojo np = getNavById(nav.getId());
		np.setNavvalue(nav.getNavvalue());
		eManager.flush();
	}

	@Override
	public void deleteNav(int navId) {
		eManager.remove(navId);
	}

	@Override
	public boolean navExists(String title, String category) {
		String hql = "FROM com.hbd.pojo.NavPojo as nav WHERE nav.id = ? and nav.compName = ?";
		int count = eManager.createQuery(hql).setParameter(1, title).setParameter(2, category).getResultList().size();
		return count > 0 ? true : false;
	}

}
