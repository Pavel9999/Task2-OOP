package by.tc.task02.service;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.criteria.Criteria;

public interface ApplianceService {

	<E> Appliance find(Criteria<E> criteria);

}
