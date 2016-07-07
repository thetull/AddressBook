package net.tullco.addressbook.utils;

import java.util.ArrayList;
import java.util.List;

public class Path {
    public static class Web {
        public static final String INDEX = "/";
        public static final String LOGIN = "/login/";
        public static final String LOGIN_POST = "/login/post/";
        public static final String LOGOUT = "/logout/";
        public static final String ONE_CONTACT_NO_ID = "/contacts/view/";
        public static final String ONE_CONTACT = "/contacts/view/:contact_id/";
        public static final String ADD_CONTACT="/contacts/add/";
        public static final String EDIT_CONTACT="/contacts/edit/:contact_id/";
        public final static String SEARCH_POST = "/contacts/search/";
        public final static String SEARCH_RESULTS = "/contacts/search/:search/";
        public final static String STYLESHEET = "/css/style.css";
        public final static String IMAGE_DIRECTORY = "/img/";
        public final static String EDIT_ADDRESS = "/addresses/edit/:address_id/";
        public final static String ADD_ADDRESS = "/addresses/add/:contact_id/";
        public final static String ADDRESS_POST = "/addresses/post/";
        public final static String PHONE_NUMBER_POST="/phone_numbers/post/";
        public final static String EDIT_PHONE_NUMBER = "/phone_numbers/edit/:phone_number_id/";
        public final static String ADD_PHONE_NUMBER = "/phone_numbers/add/:contact_id/";
        public final static String CONTACT_POST = "/contacts/post/";
        public final static String BACKUP="/backup/";
        public final static String RESTORE="/backup/restore/";
        public final static String ADMIN_POST="/admin/post/";
        public final static String ADMIN_USER_ADD="/admin/user_add/";
        public final static String CHANGE_PASSWORD="/admin/change_password/";
        
        public static String getONE_CONTACT(){
        	return ONE_CONTACT_NO_ID;
        }
        public static String getIMAGE_DIRECTORY(){
        	return IMAGE_DIRECTORY;
        }
        public static String getSTYLESHEET(){
        	return STYLESHEET;
        }
        public static String getADDRESS_POST(){
        	return ADDRESS_POST;
        }
        public static String getADD_ADDRESS(){
        	return ADD_ADDRESS.replace(":contact_id/", "");
        }
        public static String getEDIT_ADDRESS(){
        	return EDIT_ADDRESS.replace(":address_id/", "");
        }
        public static String getPHONE_NUMBER_POST(){
        	return PHONE_NUMBER_POST;
        }
        public static String getADD_PHONE_NUMBER(){
        	return ADD_PHONE_NUMBER.replace(":contact_id/","");
        }
        public static String getEDIT_PHONE_NUMBER(){
        	return EDIT_PHONE_NUMBER.replace(":phone_number_id/", "");
        }
        public static String getLOGIN_POST(){
        	return LOGIN_POST;
        }
        public static String getContactPath(int contact_id){
        	return ONE_CONTACT_NO_ID+contact_id+"/";
        }
        public static String getADD_CONTACT(){
        	return ADD_CONTACT;
        }
        public static String getCONTACT_POST(){
        	return CONTACT_POST;
        }
        public static String getContactEdit(int contact_id){
        	return EDIT_CONTACT.replace(":contact_id/", "")+contact_id+"/";
        }
        public static String getADMIN_POST(){
        	return ADMIN_POST;
        }
        public static String getSEARCH_POST(){
        	return SEARCH_POST;
        }
        public static List<String> getUnprotectedPaths(){
        	ArrayList<String> paths = new ArrayList<String>();
        	paths.add(LOGIN);
        	paths.add(LOGIN_POST);
        	paths.add(LOGOUT);
        	paths.add(BACKUP);
        	paths.add(RESTORE);
        	return paths;
        }
    }

    public static class Template {
        public final static String INDEX = "/templates/contact/list.vm";
        public final static String LOGIN = "/templates/login/login.vm";
        public static final String ONE_CONTACT = "/templates/contact/details.vm";
        public static final String LIST_CONTACTS = "/templates/contact/list.vm";
        public static final String NOT_FOUND = "/templates/notFound.vm";
        public static final String EDIT_ADDRESS = "/templates/address/edit.vm";
        public static final String EDIT_PHONE_NUMBER = "/templates/phoneNumbers/edit.vm";
        public static final String EDIT_CONTACTS = "/templates/contact/edit.vm";
        public static final String EDIT_USER = "/templates/admin/editUser.vm";
        public static final String CHANGE_PASSWORD = "/templates/admin/changePassword.vm";
    }
}
