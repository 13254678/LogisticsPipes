package logisticspipes.proxy.cc.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CCQueued {
	String event() default "";
	String prefunction() default "";
	boolean realQueue() default true;
}
