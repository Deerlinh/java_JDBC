 import com.kaishengit.dao.ProductDao;

 import com.kaishengit.entity.Mybatis;
 import org.junit.Test;
 import org.springframework.beans.factory.annotation.Autowired;

 import java.util.List;


 /**
 * Created by 蔡林红 on 2017/10/30.
 */

    public class ProductDaoTest extends BaseTest {
    @Autowired
    private  ProductDao productDao;
    @Test
    public  void save(){
        Mybatis mybatis= new Mybatis();
        mybatis.setName("jake");
        mybatis.setAge(33);
        mybatis.setClsId(2);

        productDao.save(mybatis);
    }

    @Test
    public void findById(){
        Mybatis mybatis=productDao.findById(3512);
        System.out.println(mybatis);

    }

    @Test
    public void findAll(){
        List<Mybatis> mybatisList= productDao.findAll();

        for(Mybatis mybatis: mybatisList){
            System.out.println(mybatis);
        }
    }

    @Test
    public  void count(){
        System.out.println(productDao.count());
    }
}
