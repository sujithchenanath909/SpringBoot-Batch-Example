package online.sujith.springbatchexample.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.adapter.ItemProcessorAdapter;
import org.springframework.stereotype.Component;

import online.sujith.springbatchexample.model.User;

@Component
public class Processor implements ItemProcessor<User,User>{

	private static final Map<String,String> DEPT_NAMES=new HashMap<>();
	
	public Processor() {
		DEPT_NAMES.put("001", "IT");
		DEPT_NAMES.put("002", "SCIENCE");
		DEPT_NAMES.put("003", "SOCIAL");

	}
	@Override
	public User process(User user) throws Exception {
		//changed dept code to dept name in processor
		user.setDept(DEPT_NAMES.get(user.getDept()));
		
		return user;
	}

}
 	 	