package abobora.hackathon.gervasio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import abobora.hackathon.gervasio.repository.EstoqueRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GervasioApplicationTests {

	@Autowired private EstoqueRepository estoqueRepository;
	
	@Test
	public void contextLoads() {
		
		System.out.println("--------------->>>>>>  " + estoqueRepository.findTotalAtivosFilial().size());
	}

}
