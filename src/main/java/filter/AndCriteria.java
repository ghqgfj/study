package filter;

import java.util.List;

public class AndCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	public AndCriteria(Criteria criteria,Criteria otherCriteria){
		this.criteria=criteria;
		this.otherCriteria=otherCriteria;
	}
	public List<Person> meetCriteria(List<Person> list) {
		List<Person> first=criteria.meetCriteria(list);
		return otherCriteria.meetCriteria(first);
	}

}
