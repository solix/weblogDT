package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

import models.*;

/**
 * Manage a database of computers
 */
public class Application extends Controller {

    /**
     * Handle default path requests, redirect to computers list
     */
    public static Result index() {
        return ok(main.render());
    }

}