package study.com.designpatternstudy.factory;

/**
 * 使用反射来根据参数创建对象
 */
public class CreateProductFactory {
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
