package mx.att.digital.productorderingmanagement.adapter.in.web;

import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
@Controller
@RequestMapping("${openapi.productOrdering.base-path:/tmf-api/productOrderingManagement/v4}")
public class CancelProductOrderApiController implements CancelProductOrderApi {

    private final CancelProductOrderApiDelegate delegate;

    public CancelProductOrderApiController(@Autowired(required = false) CancelProductOrderApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CancelProductOrderApiDelegate() {});
    }

    @Override
    public CancelProductOrderApiDelegate getDelegate() {
        return delegate;
    }

}
