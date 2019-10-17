package works.weave.socks.cart.configuration;

import org.springframework.context.annotation.Configuration;
import works.weave.socks.cart.middleware.RequestCounterInterceptor;
//import works.weave.socks.cart.middleware.HTTPMonitoringInterceptor;

@Configuration
public class WebMvcConfig {
	@Autowired
	private RequestCounterInterceptor requestCounterInterceptor;

	//@Autowired
	//private RequestTimingInterceptor requestTimingInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestCounterInterceptor);
		//registry.addInterceptor(requestTimingInterceptor);
	}
}
