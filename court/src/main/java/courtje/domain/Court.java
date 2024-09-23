package courtje.domain;

import courtje.CourtApplication;
import courtje.domain.CourtDecreased;
import courtje.domain.CourtIncreased;
import courtje.domain.FullyBooked;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Court_table")
@Data
//<<< DDD / Aggregate Root
public class Court {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String courtName;

    private Integer qty;

    @PostPersist
    public void onPostPersist() {
        CourtDecreased courtDecreased = new CourtDecreased(this);
        courtDecreased.publishAfterCommit();

        CourtIncreased courtIncreased = new CourtIncreased(this);
        courtIncreased.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        FullyBooked fullyBooked = new FullyBooked(this);
        fullyBooked.publishAfterCommit();
    }

    public static CourtRepository repository() {
        CourtRepository courtRepository = CourtApplication.applicationContext.getBean(
            CourtRepository.class
        );
        return courtRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseCourt(MachineStarted machineStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        Court court = new Court();
        repository().save(court);

        CourtDecreased courtDecreased = new CourtDecreased(court);
        courtDecreased.publishAfterCommit();
        FullyBooked fullyBooked = new FullyBooked(court);
        fullyBooked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(machineStarted.get???()).ifPresent(court->{
            
            court // do something
            repository().save(court);

            CourtDecreased courtDecreased = new CourtDecreased(court);
            courtDecreased.publishAfterCommit();
            FullyBooked fullyBooked = new FullyBooked(court);
            fullyBooked.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void increaseCourt(MachineStopped machineStopped) {
        //implement business logic here:

        /** Example 1:  new item 
        Court court = new Court();
        repository().save(court);

        CourtIncreased courtIncreased = new CourtIncreased(court);
        courtIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(machineStopped.get???()).ifPresent(court->{
            
            court // do something
            repository().save(court);

            CourtIncreased courtIncreased = new CourtIncreased(court);
            courtIncreased.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
