package com.xinhnguyen.web.docs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The ApiDocsController is a Spring MVC web controller class which serves the
 * Swagger user interface HTML page.
 *
 * @author Xinh Nguyen
 */
@Controller
public class ApiDocsController {

    /**
     * Request handler to serve the Swagger user interface HTML page configured
     * to the mapped context path.
     *
     * @return A String name of the Swagger user interface HTML page name.
     */
    @RequestMapping("/docs")
    public String getSwaggerApiDocsPage() {
        return "redirect:swagger-ui.html";
    }

}

