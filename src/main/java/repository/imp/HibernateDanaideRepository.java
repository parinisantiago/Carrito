package repository.imp;

import model.Danaide;
import repository.bi.DanaideRepositoryBI;

public class HibernateDanaideRepository extends BaseHibernateRepository implements DanaideRepositoryBI{

	@Override
	public Danaide getDanaide() {
		Danaide danaide = (Danaide) this.getSession().createQuery("FROM Danaide").list().iterator().next();
		return danaide;
	}

}