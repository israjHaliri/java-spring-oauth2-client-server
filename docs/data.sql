INSERT INTO oauth_client_details
(client_id, client_secret, scope,authorized_grant_types, access_token_validity,additional_information)
VALUES
('clientServer', 'secret', 'read,write', 'authorization_code,password,refresh_token,implicit', '900', '')