package by.tc.task02.dao;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.criteria.Criteria;

public interface ApplianceDAO {
	<E> Appliance find(Criteria<E> criteria);
}
