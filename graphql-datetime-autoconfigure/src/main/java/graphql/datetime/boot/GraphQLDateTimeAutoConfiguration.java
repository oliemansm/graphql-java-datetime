/*
 *  Copyright 2017 Alexey Zhokhov
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package graphql.datetime.boot;

import com.oembedler.moon.graphql.boot.GraphQLJavaToolsAutoConfiguration;
import graphql.datetime.GraphQLDate;
import graphql.datetime.GraphQLLocalDate;
import graphql.datetime.GraphQLLocalDateTime;
import graphql.datetime.GraphQLLocalTime;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href='mailto:alexey@zhokhov.com'>Alexey Zhokhov</a>
 */
@Configuration
@AutoConfigureBefore({GraphQLJavaToolsAutoConfiguration.class})
public class GraphQLDateTimeAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public GraphQLDate graphQLDate() {
        return new GraphQLDate();
    }

    @Bean
    @ConditionalOnMissingBean
    public GraphQLLocalDate graphQLLocalDate() {
        return new GraphQLLocalDate();
    }

    @Bean
    @ConditionalOnMissingBean
    public GraphQLLocalDateTime graphQLLocalDateTime() {
        return new GraphQLLocalDateTime();
    }

    @Bean
    @ConditionalOnMissingBean
    public GraphQLLocalTime graphQLLocalTime() {
        return new GraphQLLocalTime();
    }

}