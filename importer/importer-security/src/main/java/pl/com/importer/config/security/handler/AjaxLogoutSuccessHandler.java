package pl.com.importer.config.security.handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Interface AjaxLogoutSuccessHandler
 *
 * @author Artur Olbromski artur.olbromski@gmail.pl
 */
public interface AjaxLogoutSuccessHandler extends LogoutSuccessHandler {

    void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
                         Authentication authentication) throws IOException, ServletException;

}
