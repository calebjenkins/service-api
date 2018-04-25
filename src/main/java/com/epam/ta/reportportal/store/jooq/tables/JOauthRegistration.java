/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables;


import com.epam.ta.reportportal.store.jooq.Indexes;
import com.epam.ta.reportportal.store.jooq.JPublic;
import com.epam.ta.reportportal.store.jooq.Keys;
import com.epam.ta.reportportal.store.jooq.tables.records.JOauthRegistrationRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JOauthRegistration extends TableImpl<JOauthRegistrationRecord> {

    private static final long serialVersionUID = -178748316;

    /**
     * The reference instance of <code>public.oauth_registration</code>
     */
    public static final JOauthRegistration OAUTH_REGISTRATION = new JOauthRegistration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JOauthRegistrationRecord> getRecordType() {
        return JOauthRegistrationRecord.class;
    }

    /**
     * The column <code>public.oauth_registration.id</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>public.oauth_registration.client_id</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.oauth_registration.client_secret</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> CLIENT_SECRET = createField("client_secret", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.oauth_registration.client_auth_method</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> CLIENT_AUTH_METHOD = createField("client_auth_method", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>public.oauth_registration.auth_grant_type</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> AUTH_GRANT_TYPE = createField("auth_grant_type", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>public.oauth_registration.redirect_uri_template</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> REDIRECT_URI_TEMPLATE = createField("redirect_uri_template", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.oauth_registration.authorization_uri</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> AUTHORIZATION_URI = createField("authorization_uri", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.oauth_registration.token_uri</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> TOKEN_URI = createField("token_uri", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.oauth_registration.user_info_endpoint_uri</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> USER_INFO_ENDPOINT_URI = createField("user_info_endpoint_uri", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.oauth_registration.user_info_endpoint_name_attr</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> USER_INFO_ENDPOINT_NAME_ATTR = createField("user_info_endpoint_name_attr", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.oauth_registration.jwk_set_uri</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> JWK_SET_URI = createField("jwk_set_uri", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.oauth_registration.client_name</code>.
     */
    public final TableField<JOauthRegistrationRecord, String> CLIENT_NAME = createField("client_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * Create a <code>public.oauth_registration</code> table reference
     */
    public JOauthRegistration() {
        this(DSL.name("oauth_registration"), null);
    }

    /**
     * Create an aliased <code>public.oauth_registration</code> table reference
     */
    public JOauthRegistration(String alias) {
        this(DSL.name(alias), OAUTH_REGISTRATION);
    }

    /**
     * Create an aliased <code>public.oauth_registration</code> table reference
     */
    public JOauthRegistration(Name alias) {
        this(alias, OAUTH_REGISTRATION);
    }

    private JOauthRegistration(Name alias, Table<JOauthRegistrationRecord> aliased) {
        this(alias, aliased, null);
    }

    private JOauthRegistration(Name alias, Table<JOauthRegistrationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.OAUTH_REGISTRATION_CLIENT_ID_KEY, Indexes.OAUTH_REGISTRATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JOauthRegistrationRecord> getPrimaryKey() {
        return Keys.OAUTH_REGISTRATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JOauthRegistrationRecord>> getKeys() {
        return Arrays.<UniqueKey<JOauthRegistrationRecord>>asList(Keys.OAUTH_REGISTRATION_PKEY, Keys.OAUTH_REGISTRATION_CLIENT_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthRegistration as(String alias) {
        return new JOauthRegistration(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthRegistration as(Name alias) {
        return new JOauthRegistration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JOauthRegistration rename(String name) {
        return new JOauthRegistration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JOauthRegistration rename(Name name) {
        return new JOauthRegistration(name, null);
    }
}
