package hello.core.beanfind;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

import hello.core.AppConfig;
import hello.core.discount.RateDiscountPolicy;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;

public class ApplicationContextExtendsFindTest {
    
    // AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

    // @Test 
    // @DisplayName("부모 타입으로 조회시, 자식이 둘 이상 있으면, 중복 오류가 발생한다")
    // public void findBeanByParentTypeDuplicate() {
    //     assertThrows(NoUniqueBeanDefinitionException.class, 
    //         () -> ac.getBean(DiscountPolicy.class));
    // }

    // @Test
    // @DisplayName("부모 타입으로 조회시, 자식이 둘 이상 있으면, 빈 이름을 지정하면 된다")
    // public void findBeanByParentTypeBeanName() {
    //     DiscountPolicy rateDiscountPolicy = ac.getBean("rateDiscountPolicy", DiscountPolicy.class);
    //     Assertions.assertThat(rateDiscountPolicy).isInstanceOf(RateDiscountPolicy.class);
    // }

    // @Test
    // @DisplayName("부모 타입으로 모두 조회하기")
    // public void findAllBeanByParentType() {
    //     Map<String, DiscountPolicy> beansOfType = ac.getBeansOfType(DiscountPolicy.class);
    //     Assertions.assertThat(beansOfType.size()).isEqualTo(2);
    //     for (String key : beansOfType.keySet()) {
    //         System.out.println("key = " + key + " value = " + beansOfType.get(key));
    //     }
    // }


    // @Configuration 
    // static class TestConfig {

    //     @Bean 
    //     // 리턴타입을 RateDiscountPolicy 로 해도 되지만, 가독성이나 
    //     // 역할과 분리 측면에서 DiscountPolicy 로 리턴타입을 설정하는 것이 훨씬 나음
    //     public DiscountPolicy rateDiscountPolicy() {
    //         return new RateDiscountPolicy();
    //     }

    //     @Bean 
    //     public DiscountPolicy fixDiscountPolicy() {
    //         return new FixDiscountPolicy();
    //     }

    // }


}
