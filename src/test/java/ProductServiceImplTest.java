import com.kaishengit.Application;
import com.kaishengit.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by 蔡林红 on 2017/10/30.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)/*(locations = "classpath:applicationContext.xml")*//*classes = applicationContext.class*/
public class ProductServiceImplTest  {


  @Autowired
    private ProductService productService;

    @Test
    public  void  save(){
        productService.save();
    }

}
